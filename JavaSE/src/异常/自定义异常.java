package 异常;

public class 自定义异常 {
    public static void main(String[] args) {
        int age = 18;
        if (age > 16) {
            throw new AgeOutOfBoundsException();
        }
    }
}

// 运行时异常
class AgeOutOfBoundsException extends RuntimeException {
    public AgeOutOfBoundsException() {
    }

    public AgeOutOfBoundsException(String message) {
        super(message);
    }
}

// 编译时云长
class AgeOutOfBoundsException1 extends Exception {

}



