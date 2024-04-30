import java.util.HashMap;

public class DeliveryDataService {
    private HashMap<String, String> phoneToNameMap;

    public DeliveryDataService() {
        phoneToNameMap = new HashMap<>();
    }

    public void addData(String phoneNumber, String fullName) {
        phoneToNameMap.put(phoneNumber, fullName);
    }

    public String findFullNameByPhoneNumber(String phoneNumber) {
        return phoneToNameMap.get(phoneNumber);
    }

    public static void main(String[] args) {
        DeliveryDataService deliveryDataService = new DeliveryDataService();
        deliveryDataService.addData("1234567890", "Айзирек Токтосунова");
        deliveryDataService.addData("9876543210", "Александр Семенович");


        String fullName = deliveryDataService.findFullNameByPhoneNumber("1234567890");
        System.out.println(fullName);
    }
}


