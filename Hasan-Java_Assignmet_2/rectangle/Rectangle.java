package rectangle;

public class Rectangle {
    private double length;
    private double width;

    // Constructor with default values
    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Method to calculate area
    public double calculateArea() {
        return length * width;
    }

    // Setter method for length with validation
    public void setLength(double length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length;
        } else {
            System.out.println("Invalid length. Length should be larger than 0.0 and less than 20.0");
        }
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for width with validation
    public void setWidth(double width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Invalid width. Width should be larger than 0.0 and less than 20.0");
        }
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }
}
