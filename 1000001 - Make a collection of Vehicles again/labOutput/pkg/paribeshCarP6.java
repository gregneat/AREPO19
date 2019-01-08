package pkg;

public class paribeshCarP6 implements Vehicle {
	private Rectangle t_body;
	private Rectangle window;
	private Rectangle t_seat;
	private Rectangle l_body;
	private Text name;
	private Rectangle boundBox;
	private Ellipse[] wheel = new Ellipse[3];

	public paribeshCarP6() {
	}

	public paribeshCarP6(int x, int y) {
		boundBox = new Rectangle(x, x, 110, 70);
		t_body = new Rectangle(x, y, 60, 40);
		t_seat = new Rectangle(x + 60, y + 20, 45, 20);
		l_body = new Rectangle(x, y + 40, 105, 20);

		wheel[0] = new Ellipse(x + 5, y + 45, 20, 20);
		wheel[1] = new Ellipse((x + 50) + 20, y + 45, 20, 20);
		name = new Text(x, y, "");
	}

	public paribeshCarP6(int x, int y, Color c) {
		this(x, y);

		t_body.setColor(c);
	}

	public paribeshCarP6(int x, int y, Color c, String N) {
		this(x, y, c);
		name = new Text(x + 5, y + 5, N);
	}

	public void setColor(Color c) {
		t_body.setColor(c);
	}

	public void draw() {
		wheel[0].fill();
		wheel[1].fill();
		wheel[0].setColor(Color.GRAY);
		wheel[1].setColor(Color.GRAY);
		l_body.fill();
		t_body.fill();
		t_seat.fill();
		t_seat.setColor(Color.CYAN);
		l_body.setColor(Color.BLUE);
		name.draw();
	}
	public void translate(double MOVEX, double MOVEY) {
		wheel[0].translate(MOVEX, MOVEY);
		wheel[1].translate(MOVEX, MOVEY);
		// wheel[2].translate(MOVEX,MOVEY);
		t_body.translate(MOVEX, MOVEY);
		t_seat.translate(MOVEX, MOVEY);
		l_body.translate(MOVEX, MOVEY);
		boundBox.translate(MOVEX, MOVEY);
		name.translate(MOVEX, MOVEY);
	}

	public int getX() {
		return boundBox.getX();
	}

	public int getY() {
		return boundBox.getY();
	}

	public int getWidth() {
		return boundBox.getWidth();
	}

	public int getHeight() {
		return boundBox.getHeight();
	}

	public Rectangle getBounds() {
		return boundBox;
	}

}