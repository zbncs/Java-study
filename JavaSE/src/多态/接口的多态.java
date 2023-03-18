package 多态;

public class 接口的多态 {
    public static void main(String[] args) {
        // 变量多态
        Player p = new Mp3Player();
        p.play();
    }

    // 参数多态
    public static void showPlayer(Player player) {
        player.play();
    }

    // 返回值多态
    public static Player getPlayer() {
        return new Mp3Player();
    }
}


interface Player {
    void play();
}

class Mp3Player implements Player {

    @Override
    public void play() {
        System.out.println("mp3");
    }
}



