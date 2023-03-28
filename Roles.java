/**
 * 
 */
package ustbatchno3.Constructorinjuction;

/**
 * @author Administrator
 *
 */
public class Roles {
	
		public String charactername;
		public String responsibility;
		public Roles(String charactername, String responsibility) {
			super();
			this.charactername = charactername;
			this.responsibility = responsibility;
		}
		@Override
		public String toString() {
			return "Roles [charactername=" + charactername + ", responsibility=" + responsibility + "]";
		}
		public void display() {
			System.out.println("My name is  : "+charactername+ "  and my responsibility is  :  "+responsibility);

		}
}
