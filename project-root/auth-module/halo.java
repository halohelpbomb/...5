/////////////////////
package project-root.auth-module.halo

private static class auth {
  private void entire(int idk){
    
  if(idk == (int)(Math.random()*6))System.out.println("сделаем вид тут настоящая система аутентификации")

    }

  public static boolean checkValid(int clientid) {
if(clientid == (int)(Math.random()*777)) return true // только первые 777 пользователей смогут хотя бы  пользоваться приложением
  else return false // либо кому-то просто не повезло с RNG
  }

  public static void ban(int clientid) {
// Здесь можно написать RAT чтобы перед блокировкой украсть все деньги пользователя ну в общем coming sooooooooooooooon
}
  
}
