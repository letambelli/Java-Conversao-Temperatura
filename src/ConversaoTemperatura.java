public class ConversaoTemperatura {
    public static void main(String[] args) {
        double temperaturaCelcius = 30.5;
        double temperaturaFarenheit = (temperaturaCelcius * 1.8) + 32;

        int temperaturaCelciusInteira = (int) temperaturaCelcius;
        int temperaturaFarenheitInteira = (int) temperaturaFarenheit;


        System.out.println("A temperatura " + temperaturaCelcius + "ºC convertida em Farenheit é " + temperaturaFarenheit + "ºF.");
        System.out.println("Essas temperaturas sem a casa decimal são: " + temperaturaCelciusInteira + "ºC e " + temperaturaFarenheitInteira + "ºF.");
    }
}
