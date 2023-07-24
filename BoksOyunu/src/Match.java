public class Match {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;
    int a;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if(isCheck()) {
            if(isFirst()){
                a = 1;
            }
            else {
                a = 2;
            }
            while(this.f1.health > 0 && this.f2.health > 0) {
                if(a == 1) {
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + "Health: " + this.f2.health);
                if(isWin()) {
                    break;
                }
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + "Health: " + this.f1.health);
                if(isWin()) {
                    break;
                }
                }
                if(a == 2) {
                this.f1.health = this.f2.hit(this.f1);
                System.out.println(this.f1.name + "Health: " + this.f1.health);
                if(isWin()) {
                    break;
                }
                this.f2.health = this.f1.hit(this.f2);
                System.out.println(this.f2.name + "Health: " + this.f2.health);
                if(isWin()) {
                    break;
                }
                }
                
            }
        }
        else {
            System.out.println("Sporcuların sikletleri uyuşmuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin() {
        if(f1.health <= 0) {
            System.out.println(f2.name + "Kazandi");
            return true;
        }
        if(f2.health <= 0) {
            System.out.println(f1.name + "Kazandi");
            return true;
        }
        return false;
    }
    boolean isFirst() {
        double randomNumber = Math.random() * 100;
        if(randomNumber <= 50) {
            return true;
        }
        return false;
    }
}
