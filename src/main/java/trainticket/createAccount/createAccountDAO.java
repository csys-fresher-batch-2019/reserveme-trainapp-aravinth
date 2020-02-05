package trainticket.createAccount;

public interface createAccountDAO {
	public int AddUser(createAccount l)throws Exception;
	public boolean checkEmail(String mail)throws Exception;
	public boolean checkLogin(int userId,String Password)throws Exception;
    public boolean checkId(int userId,String emailId) throws Exception;
    public boolean changePassword(int userId,String a1)throws Exception;
    public boolean checkPassword(int userId,String oldPassword)throws Exception;
}
