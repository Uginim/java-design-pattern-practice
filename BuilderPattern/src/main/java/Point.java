public class Point {
    private Float x;
    private Float y;
    private  Float z;

    private Point(float x, float y,float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static PointBuilder builder(){
        return new PointBuilder();
    }

    static class PointBuilder {
        private Float x;
        private Float y;
        private Float z;
        public PointBuilder x(float x){
            this.x = x;
            return this;
        }
        public PointBuilder y(float z){
            this.y = y;
            return this;
        }
        public PointBuilder z(float z){
            this.z = z;
            return this;
        }
        public Point build() {
            return new Point(x,y,z);
        }
    }
}
