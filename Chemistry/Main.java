import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String command = null;
        SubstanceN1 substanceN1 = null;
        SubstanceN2 substanceN2 = null;
        Reaction reaction = null;
        List<SubstanceN1> substanceN1s = new ArrayList<SubstanceN1>();
        List<SubstanceN2> substanceN2s = new ArrayList<SubstanceN2>();
        List<Reaction> reactions = new ArrayList<Reaction>();
        while (true){
            command = scanner.nextLine();
            if (command.equals("Новая реакция")){
                substanceN1 = createSubstanceN1();
                substanceN2 = createSubstanceN2();
                reaction = createReaction();
                substanceN1s.add(substanceN1);
                substanceN2s.add(substanceN2);
                reactions.add(reaction);
            }
            else if (command.equals("Найти реакцию")){
                Reaction reaction1 = findCurrentReaction(reactions);
                if (reaction1 == null) {
                    System.out.println("Данная реакция ещё не была создана");
                }
                else {
                    System.out.println(reaction.getNumber());
                    System.out.println(reaction.getInfo());
                }
                SubstanceN1 substanceN11 = findCurrentSubstanceN1(substanceN1s);
                if (substanceN11 == null){
                    System.out.println("Данное вещество не было записано");
                }
                else {
                    System.out.println(substanceN1.getName());
                    System.out.println(substanceN1.getMolarmass());
                    System.out.println(substanceN1.getPeriod());
                    System.out.println(substanceN1.getGroup());
                    System.out.println(substanceN1.getComplicasy());
                }
                SubstanceN2 substanceN21 = findCurrentSubstanceN2(substanceN2s);
                if (substanceN21 == null){
                    System.out.println("Данное вещество не было записано");
                }
                else{
                    System.out.println(substanceN2.getName());
                    System.out.println(substanceN2.getMolarmass());
                    System.out.println(substanceN2.getPeriod());
                    System.out.println(substanceN2.getGroup());
                    System.out.println(substanceN2.getComplicasy());
                }

            }
            else if(command.equals("Изменить реакцию")){
                changeNumber(reaction);
                changeInfoN1(substanceN1);
                changeInfoN2(substanceN2);
            }
        }


    }

    private static void changeInfoN2(SubstanceN2 substanceN2) {
        System.out.println("Введите новый номер второго вещества");
        String number = scanner.nextLine();
        substanceN2.setNumber(number);
        System.out.println("Введите новое название второго вещества");
        String name = scanner.nextLine();
        substanceN2.setName(name);
        System.out.println("Введите новую молярную массу вещества");
        String molarmass = scanner.nextLine();
        substanceN2.setMolarmass(molarmass);
        System.out.println("Введите новый период вещества согласно таблице Менделеева");
        String period = scanner.nextLine();
        substanceN2.setPeriod(period);
        System.out.println("Введите новый номер группы вещества согласно таблице Менделеева ");
        String group = scanner.nextLine();
        substanceN2.setGroup(group);
        System.out.println("Введите сложность вещества (простое или сложное)");
        String complicasy = scanner.nextLine();
        substanceN2.setComplicasy(complicasy);
    }

    private static void changeNumber(Reaction reaction) {
        System.out.println("Введите новый номер реакции");
        String number = scanner.nextLine();
        reaction.setNumber(number);
        System.out.println("Введите новую информацию о реакции");
        String info = scanner.nextLine();
        reaction.setInfo(info);
    }
    private static void changeInfoN1(SubstanceN1 substanceN1){
        System.out.println("Введите новый номер первого вещества");
        String number = scanner.nextLine();
        substanceN1.setNumber(number);
        System.out.println("Введите новое название первого вещества");
        String name = scanner.nextLine();
        substanceN1.setName(name);
        System.out.println("Введите новую молярную массу вещества");
        String molarmass = scanner.nextLine();
        substanceN1.setMolarmass(molarmass);
        System.out.println("Введите новый период вещества согласно таблице Менделеева");
        String period = scanner.nextLine();
        substanceN1.setPeriod(period);
        System.out.println("Введите новый номер группы вещества согласно таблице Менделеева ");
        String group = scanner.nextLine();
        substanceN1.setGroup(group);
        System.out.println("Введите сложность вещества (простое или сложное)");
        String complicasy = scanner.nextLine();
        substanceN1.setComplicasy(complicasy);
    }

    private static Reaction findCurrentReaction(List<Reaction> reactions) {
        System.out.println("Введите номер реакции");
        String string = scanner.nextLine();
        for (Reaction reaction : reactions){
            if (reaction.getNumber().equals(string)){
                return reaction;
            }
        }
        return null;
    }

    private static SubstanceN1 findCurrentSubstanceN1(List<SubstanceN1> substanceN1s) {
        System.out.println("Введите номер первого вещества");
        String string = scanner.nextLine();
        for (SubstanceN1 substanceN1 : substanceN1s){
            if (substanceN1.getNumber().equals(string)){
                return substanceN1;
            }
        }
        return null;
    }

    private static SubstanceN2 findCurrentSubstanceN2(List<SubstanceN2> substanceN2s) {
        System.out.println("Введите номер второго вещества");
        String string = scanner.nextLine();
        for (SubstanceN2 substanceN2 : substanceN2s){
            if (substanceN2.getNumber().equals(string)){
                return substanceN2;
            }
        }
        return null;
    }

    private static SubstanceN1 createSubstanceN1() {
        System.out.println("Введите новый номер первого вещества");
        String number = scanner.nextLine();
        System.out.println("Введите название вещества");
        String name = scanner.nextLine();
        System.out.println("Введите молярную массу вещества");
        String molarmass = scanner.nextLine();
        System.out.println("Введите период вещества согласно таблице Менделеева");
        String period = scanner.nextLine();
        System.out.println("Введите номер группы вещества согласно таблице Менделеева ");
        String group = scanner.nextLine();
        System.out.println("Введите сложность вещества (простое или сложное)");
        String complicasy = scanner.nextLine();
        SubstanceN1 substanceN1 = new SubstanceN1(number,molarmass,period,group,complicasy,name);
        return substanceN1;
    }

    private static SubstanceN2 createSubstanceN2() {
        System.out.println("Введите новый номер второго вещества");
        String number = scanner.nextLine();
        System.out.println("Введите название вещества");
        String name = scanner.nextLine();
        System.out.println("Введите молярную массу вещества");
        String molarmass = scanner.nextLine();
        System.out.println("Введите период вещества согласно таблице Менделеева");
        String period = scanner.nextLine();
        System.out.println("Введите номер группы вещества согласно таблице Менделеева ");
        String group = scanner.nextLine();
        System.out.println("Введите сложность вещества (простое или сложное)");
        String complicasy = scanner.nextLine();
        SubstanceN2 substanceN2 = new SubstanceN2(number,molarmass,period,group,complicasy,name);
        return substanceN2;
    }
    private static Reaction createReaction() {
        System.out.println("Введите номер реакции");
        String number = scanner.nextLine();
        System.out.println("Введите информацию о реакции");
        String info = scanner.nextLine();
        Reaction reaction = new Reaction(number,info);
        return reaction;
    }

}
