package padroes.projeto;

public final  class Database {
	private static Database database;
	private int cont;
	
	private Database() {}
	
	public static Database getInstance() {
		if (database == null) {
			database = new Database();
		}
		return database;
	}
	
	public int getCont() {
		return cont++;
	}
}
