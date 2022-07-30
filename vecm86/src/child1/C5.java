package child1;
import parent1.C1;
public class C5 {
/*if i not put import and extends means c1 int a not coming ,
 * and any one not put also not coming
 * if i open c1 obj here when import st only then coming int a of pacage1
 */
	public static void main(String[] args) {
		
		C5 obj5 = new C5();
		//not coming int a here 
		
		C1 obj1  = new C1();
		System.out.println(obj1.a);
	}
}
