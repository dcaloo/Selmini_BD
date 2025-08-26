public class Teste {
    public static void main(String[] args) {
        double temp = 100;
        try {
            validar(temp);
        }
        catch (LeituraInvalidaException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("X");
        }
    }

    private static void validar(double temp) throws LeituraInvalidaException {
        if(temp < -50 || temp > 50) {
            throw new LeituraInvalidaException(12, temp);
        }
    }
}
