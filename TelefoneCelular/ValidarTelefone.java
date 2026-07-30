public class ValidarTelefone {

    private String telefone;

    public ValidarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String validarTipo() {
        var numUser = this.telefone.replaceAll("\\D", "");

        if (numUser.length() == 8) {
            var firstPart = numUser.substring(0, 4);
            var secondPart = numUser.substring(4);
            return "Telefone Fixo sem DDD: " + firstPart + "-" + secondPart;
        } else if (numUser.length() == 9) {
            var firstPart = numUser.substring(0, 5);
            var secondPart = numUser.substring(5);
            return "Celular sem DDD: " + firstPart + "-" + secondPart;
        } else if (numUser.length() == 10) {
            var ddd = numUser.substring(0, 2);
            var firstPart = numUser.substring(2, 6);
            var secondPart = numUser.substring(6);
            return "Telefone fixo com DDD: " + "(" + ddd + ")" + firstPart + "-" + secondPart;
        } else if (numUser.length() == 11) {
            var ddd = numUser.substring(0, 2);
            var firstPart = numUser.substring(2, 7);
            var secondPart = numUser.substring(7);
            return "Celular com DDD: " + "(" + ddd + ")" + firstPart + "-" + secondPart;
        } else return "Inválido!";
    }
}