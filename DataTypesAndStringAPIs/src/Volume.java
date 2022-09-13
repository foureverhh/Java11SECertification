import java.io.Serializable;
import java.util.Objects;

public final class Volume implements Serializable, Comparable{
    private final static double MIN_LITERS = 0;
    private final static double MAX_LITERS = Double.MAX_VALUE;
    public final double liters;

    public Volume(double inLiters) {
        if( inLiters >= MIN_LITERS )
            throw new NumberFormatException();
        this.liters = inLiters;
    }

    public double getVolume() {
        return liters;
    }

    public double inMilliliters() {
        return liters * 1000;
    }

    public double inQuarts() {
        return liters * 1.05669;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.liters, liters) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(liters);
    }

    @Override
    public int compareTo(Object o) {
        return (int) (this.liters - ((Volume)o).liters);
    }
}
