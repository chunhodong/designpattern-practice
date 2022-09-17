package create_pattern.builder.after;

import java.time.LocalDate;

public class TourPlanV1 {

    private String title;

    private int nights;

    private int days;

    private LocalDate startDate;

    private String whereToStay;


    public TourPlanV1(String title, int nights, int days, LocalDate startDate, String whereToStay) {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
    }

    /**
     * Builder클래스의 인스턴스변수에 접근하기위해서 new를 이용해 TourPlanV1Builder객체를 생성해야함
     * @return
     */
    public static TourPlanV1.TourPlanV1Builder builder(){
        return new TourPlanV1.TourPlanV1Builder();
    }


    public static class TourPlanV1Builder{

        private String title;

        private int nights;

        private int days;

        private LocalDate startDate;

        private String whereToStay;

        public TourPlanV1Builder title(String title){
            this.title = title;
            return this;
        }
        public TourPlanV1Builder nights(int nights){
            this.nights = nights;
            return this;
        }
        public TourPlanV1Builder days(int days){
            this.days = days;
            return this;
        }
        public TourPlanV1Builder startDate(LocalDate startDate){
            this.startDate = startDate;
            return this;
        }
        public TourPlanV1Builder whereToStay(String whereToStay){
            this.whereToStay = whereToStay;
            return this;
        }


        public TourPlanV1 build(){

            return new TourPlanV1(title,nights,days,startDate,whereToStay);
        }
    }
}
