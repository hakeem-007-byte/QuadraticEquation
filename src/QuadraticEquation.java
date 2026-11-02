void main() {

    Scanner scanner = new Scanner(System.in);

    IO.print("Enter a: ");
    double a = scanner.nextDouble();

    IO.print("Enter b: ");
    double b = scanner.nextDouble();

    IO.print("Enter c: ");
    double c = scanner.nextDouble();

    if (a == 0) {
        scanner.close();
        return;
    }

    double delta = b * b - 4 * a * c;
    int roots;

    if (delta > 0) {
        roots = 2;
    } else if (delta == 0) {
        roots = 1;
    } else {
        roots = 0;
    }

    System.out.printf("a = %.2f, b = %.2f, c = %.2f%n", a, b, c);

    switch (roots) {
        case 2:
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
            break;

        case 1:
            double x = -b / (2 * a);
            System.out.printf("x1 = x2 = %.2f%n", x);
            break;

        case 0:
            break;
    }

    scanner.close();
}
