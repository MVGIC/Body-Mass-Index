public class BmiService {
    public float calculate(float height, float weight) {

        float heightMeters = height / 100;
        float index = (weight / (heightMeters * heightMeters));

        return index;
    }

}
