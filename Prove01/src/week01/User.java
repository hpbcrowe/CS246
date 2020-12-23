package week01;

/***************************************************************
 * USER
 *  this is the class that we will make our objects that hold the
 *  users, salt, hashed password
 *
 **************************************************************/

public class User {
    private String password;
    private String salt;
    private String hashedPassword;

 /*************************************************************
 * NON DEFAULT CONSTRUCTOR
 * @param newPassword holds initial password
 *************************************************************/

    public User(String newPassword){
        this.password = newPassword;

    }

  /***************************************************************
  *    GETTERS AND SETTERS FOR MEMBER VARIABLES
  * @return
  ***************************************************************/
    public String getPassword() {
        return password;
    }
    public String getSalt() {
        return salt;
    }
    public String getHashedPassword() {
        return hashedPassword;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setSalt(String salt) {
        this.salt = salt;
    }
    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

}
