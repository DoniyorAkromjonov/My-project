package lesson4;

public class BolleanLogic {
    public static void main(String[] args) {
        boolean isBoughtBread = false;
        boolean isBoughtMilk = false;

        boolean isBoughtBreadAndMilk = isBoughtMilk && isBoughtBread;

        if (isBoughtBread && isBoughtMilk) {
            System.out.println("Он купил хлеб и молоко!");
        }else if (isBoughtMilk) {
            System.out.println("Он купил молоко!");
        }else if (isBoughtBread) {
            System.out.println("Он купил хлеб");
        }
        else {
            System.out.println("Он не купил хлеба и молока");
        }

//        Or- Или

    }
}
