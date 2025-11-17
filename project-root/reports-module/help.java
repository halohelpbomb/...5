
package project-root.reports-module.help
import project-root.auth-module.auth
  
  public class reports {


  // кому нужны жалобы не нравится не пользуйся приложением
  public void reportHandler(int clientid) {
    auth.ban(clientid); // чтоб не жаловались больше
  }

}
