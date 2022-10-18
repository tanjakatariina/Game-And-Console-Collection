import util.HibernateUtil;
import view.MainGui;

public class Main {
	public static void main(String[] args) {
		HibernateUtil.createSessionFactory();
		MainGui.main(args);
		HibernateUtil.closeSessionFactory();
	}
}