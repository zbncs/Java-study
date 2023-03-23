package 设计模式.工厂模式;

public class 工厂 {
    public static void main(String[] args) {
        Car car = CarFactory.getInstance(CarBrand.FALALI);
        car.run();
    }
}

/*
  - 需求：定义汽车工厂类，生产各种品牌的车

  - 实现步骤
      - 编写一个Car接口, 提供run方法
      - 编写一个Falali类实现Car接口,重写run方法
      - 编写一个Benchi类实现Car接口
      - 提供一个CarFactory(汽车工厂),用于生产汽车对象
      - 定义CarFactoryTest测试汽车工厂
 */

// 定义车的品牌枚举
enum CarBrand {
    // 枚举项
    FALALI, BENCHI, DAZHONG, BAOMA;
}

// 生产汽车对象的工厂
class CarFactory {
    // 私有构造
    private CarFactory() {
    }

    public static Car getInstance(CarBrand brand) {
        switch (brand) {
            case FALALI:
                return new Falali(1);
            case BENCHI:
                return new Benchi();
            default:
                return null;
        }
    }
}

//// 生产汽车对象的工厂
//class CarFactory {
//    // 私有构造
//    private CarFactory() {
//    }
//
//    public static Car getInstance(String brand) {
//        switch (brand) {
//            case "Falali":
//                return new Falali(1);
//            case "Benchi":
//                return new Benchi();
//            default:
//                return null;
//        }
//    }
//}

// 编写一个Car接口, 提供run方法
interface Car {
    public abstract void run();
}

class Falali implements Car {
    public Falali(int num) {
    }

    @Override
    public void run() {
        System.out.println("法拉利破百需要3秒!");
    }
}

class Benchi implements Car {
    @Override
    public void run() {
        System.out.println("奔驰破百需要5秒!");
    }
}
