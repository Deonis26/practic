package Test1;
//Напишите программу, которая возвращает сумму цифр,
//присутствующих в данной строке. Если цифр нет, то возвращаемая
//сумма должна быть равна 0.
public class Main {
    public static void main(String[] args) {
        int summNumber=0;
        String a="Напишите программу, которая возв1ращает сумму цифр, присутствую2щих в данной строке. Есл3и цифр нет, то возвращаемая сумма должна быть равна 0.";

        char p[]=a.toCharArray();
        for (int i = 0; i < p.length; i++) {
            if(p[i]=='0' || p[i]=='1'|| p[i]=='2'|| p[i]=='3'|| p[i]=='4'|| p[i]=='5'|| p[i]=='6'|| p[i]=='7'|| p[i]=='8' || p[i]=='9'){
                int num = Character.getNumericValue(p[i]);
                summNumber=summNumber+num;
            }
        }
        for (char massive:p){
            System.out.print(massive+"  ");
        }
        System.out.println();
        System.out.println(summNumber);
}

}