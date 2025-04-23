class MovieReview{
    private String title;
    private String review;

    public MovieReview(String title, String review) {
        this.title = title;
        this.review = review;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getReview() {
        return review;
    }
    public void setReview(String review) {
        this.review = review;
    }
    public void show(){
        System.out.println("영화제목: "+ title +",리뷰:" + review);

    }
}

public class ClassEx4 {
    public static void main(String[] args) {
                new MovieReview("인셉션", "인생은 무한 루프");
                new MovieReview("어바웃 타임", "인생 시간 영화!");

        }


    }

