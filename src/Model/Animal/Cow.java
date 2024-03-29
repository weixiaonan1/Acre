package Model.Animal;

import DesignPattern.Structure.FlyweightFactory.GoodsFactory;
import Model.Goods.Goods;
import Model.Goods.Product;
import Model.Goods.GoodsEnum;

public class Cow extends Cattle {
    private static String name = "Cow";
    private static int count = 0;
    public Cow() {
        super( 10, 5);
    }

    @Override
    public String getSelf() {
        return name + id;
    }

    @Override
    public Product getProduct() {
        Goods hair= GoodsFactory.getInstance().getGoods(GoodsEnum.MILK);
        System.out.println(this.getClass().getSimpleName()+" harvest milk");
        return hair;
    }

    @Override
    public void eat() {
        System.out.println(name + getId() + "正在吃东西");
    }

    @Override
    public boolean isNull() {
        return false;
    }


    @Override
    public void setId() {
        this.id = count++;
    }
}
