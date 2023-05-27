import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Patients patients1=new Patients("Иван","Зайцев",22,"Перелом");
        Patients patients2=new Patients("Вася","Петров",123,"Амнезия");
        Patients patients3=new Patients("Петя","Иванов",1342,"Гастрит");
        Patients patients4=new Patients("Светлана","Зайцева",214,"Воспаление легких");
        Patients patients5=new Patients("Мария","Мозгова",150,"ОРВИ");
        List<Patients> patientsList=new ArrayList<>();
        patientsList.add(patients1);
        patientsList.add(patients2);
        patientsList.add(patients3);
        patientsList.add(patients4);
        patientsList.add(patients5);
        Class<?> patientsClass=Patients.class;
        Method[] methods=patientsClass.getDeclaredMethods();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите поле");
        String pole = scanner.nextLine();
        System.out.println("Введите значение");
        String pole1=scanner.nextLine();
        List<Patients> newPatients=new ArrayList<>();
        for(Method method:methods){
            if(method.getName().startsWith("get"+pole)){
               newPatients =patientsList.stream().filter(patients -> {
                   try{
                       return   method.invoke(patients).equals(pole1);
                   } catch (Throwable e) {
                       throw new RuntimeException(e);
                   }
               }).collect(Collectors.toList());
           break;
            }
        }
        System.out.println(newPatients.toString());
    }
}