package hibernategenerato;

public interface ApDao {

	public int create(Ap ap);
	public java.util.List<Ap> retrive();
	public boolean update(Ap ap);
	public boolean delete(Ap ap);
	
	
}
