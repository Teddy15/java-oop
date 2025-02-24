public class IphoneNew implements IPhone {
    Charger iphoneOldToNewAdapter;

    public IphoneNew(Charger iphoneOldToNewAdapter) {
        this.iphoneOldToNewAdapter = iphoneOldToNewAdapter;
    }

    @Override
    public void onCharge() {
        iphoneOldToNewAdapter.charge();
    }
}
