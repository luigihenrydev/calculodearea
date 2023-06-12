import java.util.Scanner;
class az  {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
float hp, lp, ha, la;
int qtd_azulejos;

System.out.print("Digite a altura da parede: ");
hp = sc.nextFloat();
System.out.print("Digite a largura da parede: ");
lp = sc.nextFloat();
System.out.print("Digite a altura do azulejo: ");
ha = sc.nextFloat();
System.out.print("Digite a largura do azulejo: ");
la = sc.nextFloat();

float area_parede = hp * lp;
float area_azulejo = ha * la;
qtd_azulejos = (int) Math.ceil(area_parede / area_azulejo);

System.out.println("Para cobrir a parede, são necessários " + qtd_azulejos + " azulejos.");

sc.close();
 }
}