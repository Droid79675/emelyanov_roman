import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String command = null;
        Substance substance1 = null;
        Substance substance2 = null;
        Reaction reaction = null;
        List<Substance> substances = new ArrayList<Substance>();
        List<Reaction> reactions = new ArrayList<Reaction>();
        while (true){
            command = scanner.nextLine();
            if (command.equals("Новая реакция")){
                substance1 = createSubstance();
                substance2 = createSubstance();
                reaction = createReaction();
                substances.add(substance1);
                substances.add(substance2);
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
                substance1 = findCurrentSubstance(substances);
                substance2 = findCurrentSubstance(substances);
                if (substance1 == null){
                    System.out.println("Данное вещество не было записано");
                }
                if (substance2 == null){
                    System.out.println("Данное вещество не было записано");
                }
                else {
                    System.out.println(substance1.getName());
                    System.out.println(substance1.getMolarmass());
                    System.out.println(substance1.getPeriod());
                    System.out.println(substance1.getGroup());
                    System.out.println(substance2.getName());
                    System.out.println(substance2.getMolarmass());
                    System.out.println(substance2.getPeriod());
                    System.out.println(substance2.getGroup());
                }

            }
            else if(command.equals("Изменить реакцию")){
                changeNumber(reaction);
                changeInfo(substance1);
                changeInfo(substance2);
            }
        }


    }



    private static void changeNumber(Reaction reaction) {
        System.out.println("Введите новый номер реакции");
        int number = scanner.nextInt();
        reaction.setNumber(number);
        System.out.println("Введите новую информацию о реакции");
        String info = scanner.nextLine();
        reaction.setInfo(info);
    }
    private static void changeInfo(Substance substance){
        System.out.println("Введите новый номер первого вещества");
        int number = scanner.nextInt();
        substance.setNumber(number);
        System.out.println("Введите новое название первого вещества");
        String name = scanner.nextLine();
        substance.setName(name);
        System.out.println("Введите новую молярную массу вещества");
        double molarmass = scanner.nextDouble();
        substance.setMolarmass(molarmass);
        System.out.println("Введите новый период вещества согласно таблице Менделеева");
        int period = scanner.nextInt();
        substance.setPeriod(period);
        System.out.println("Введите новый номер группы вещества согласно таблице Менделеева ");
        int group = scanner.nextInt();
        substance.setGroup(group);
    }

    private static Reaction findCurrentReaction(List<Reaction> reactions) {
        System.out.println("Введите номер реакции");
        int number = scanner.nextInt();
        for (Reaction reaction : reactions){
            if (reaction.getNumber() == number){
                return reaction;
            }
        }
        return null;
    }

    private static Substance findCurrentSubstance(List<Substance> substances) {
        System.out.println("Введите номер вещества");
        int number = scanner.nextInt();
        for (Substance substance : substances){
            if (substance.getNumber() == number){
                return substance;
            }
        }
        return null;
    }


    private static Substance createSubstance() {
        System.out.println("Введите номер вещества");
        int number = scanner.nextInt();
        System.out.println("Введите название вещества");
        String name = scanner.nextLine();
        System.out.println("Введите молярную массу вещества");
        double molarmass = scanner.nextDouble();
        System.out.println("Введите период вещества согласно таблице Менделеева");
        int period = scanner.nextInt();
        System.out.println("Введите номер группы вещества согласно таблице Менделеева ");
        int group = scanner.nextInt();
        Substance substance = new Substance(number,molarmass,period,group,name);
        return substance;
    }

    private static Reaction createReaction() {
        System.out.println("Введите номер реакции");
        int number = scanner.nextInt();
        System.out.println("Введите информацию о реакции");
        String info = scanner.nextLine();
        Reaction reaction = new Reaction(number,info);
        return reaction;
    }

}
