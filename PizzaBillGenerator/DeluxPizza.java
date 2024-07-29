public class DeluxPizza extends Pizza {
        public DeluxPizza(Boolean veg) {
            super(veg);
            super.addExtraCheese();
            super.addExtraTopping();
            super.takeAway();
        }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraTopping() {

    }
}
