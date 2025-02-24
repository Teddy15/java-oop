public class IphoneOldToNewAdapter implements Charger {
    IphoneOldCharger iphoneOldCharger;

    IphoneOldToNewAdapter() {
        iphoneOldCharger = new IphoneOldCharger();
    }

    @Override
    public void charge() {
        iphoneOldCharger.charge();
    }
}
