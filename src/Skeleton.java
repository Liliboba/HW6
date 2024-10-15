public class Skeleton extends Boss { // я считаю это отсылкой к мобу из Майнкрфта "Скелет"
    private int arrowCount;

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public int getArrowCount() {
        return arrowCount;
    }
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Arrows: " + arrowCount);
    }
}
