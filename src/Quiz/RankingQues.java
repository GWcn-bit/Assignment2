/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
class RankingQues extends Question {
    private int rank;

    public RankingQues(String t) {
        super(t);
    }

    public void setRank(int r) {
        rank = r;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public void ask() {
        System.out.println(getText());
        System.out.println("(0 = Not at all, 5 = Always)");
    }
}