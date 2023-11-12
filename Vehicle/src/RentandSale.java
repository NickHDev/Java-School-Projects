public class RentandSale implements RentInterface,SaleInterface {
    //implementing methods from interfaces
    @Override
    public boolean hireThis(int renter) {
        boolean canHire;
        canHire = renter <= 5;
        return canHire;
    }

    @Override
    public boolean returnThis(int miles) {
        boolean canReturn;
        canReturn = miles <= 100000;
        return canReturn;
    }

    @Override
    public boolean transferOwnership(int buyer) {
        boolean canTransfer;
        canTransfer = buyer >= 5;
        return canTransfer;
    }
}
