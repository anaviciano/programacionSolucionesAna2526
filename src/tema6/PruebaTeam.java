package tema6;

public class PruebaTeam {
    public static void main(String[] args) {
        //puedo crear un player sin haber creado ningún team
        Team.Player player=new Team.Player();


        Team team = new Team();
        //no puedo crear un staff, porque es privada y solo es accesible desde dentro de la clase Team
        //Team.Staff staff= team.new Team.Staff();
        //team.Staff staff2= team.new Team.Staff();
    }
}
