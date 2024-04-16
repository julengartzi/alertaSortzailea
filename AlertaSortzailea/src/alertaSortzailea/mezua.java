package alertaSortzailea;

public class mezua {
	String izena;
	String deskribapena;
	int data;
	int ordua;
	boolean errepikakorra;
	String jasotzailea;

	/**
	 * 
	 * @param izena
	 * @param deskribapena
	 * @param data
	 * @param ordua
	 * @param errepikakorra
	 * @param jasotzailea
	 */
	public mezua(String izena, String deskribapena, int data, int ordua, boolean errepikakorra, String jasotzailea) {
		this.izena=izena;
		this.deskribapena=deskribapena;
		this.data=data;
		this.ordua=ordua;
		this.errepikakorra=errepikakorra;
		this.jasotzailea=jasotzailea;
	}
	
}