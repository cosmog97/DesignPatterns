package it.unical.mat.ingsw.DesignPatterns.behaviorals.visitor.second;

public class XMLExportVisitor implements Visitor {

	public String export(Shape... args) {
		StringBuilder sb = new StringBuilder();
		for (Shape shape : args) {
			sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
			sb.append(shape.accept(this)).append("\n");
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		return sb.toString();
	}

	@Override
	public String visitDot(Dot d) {
		return "<dot>" + "\n" + "    <id>" + d.getId() + "</id>" + "\n" + "    <x>" + d.getX() + "</x>" + "\n"
				+ "    <y>" + d.getY() + "</y>" + "\n" + "</dot>";
	}

	@Override
	public String visitCircle(Circle c) {
		return "<circle>" + "\n" + "    <id>" + c.getId() + "</id>" + "\n" + "    <x>" + c.getX() + "</x>" + "\n"
				+ "    <y>" + c.getY() + "</y>" + "\n" + "    <radius>" + c.getRadius() + "</radius>" + "\n"
				+ "</circle>";
	}

	@Override
	public String visitRectangle(Rectangle r) {
		return "<rectangle>" + "\n" + "    <id>" + r.getId() + "</id>" + "\n" + "    <x>" + r.getX() + "</x>" + "\n"
				+ "    <y>" + r.getY() + "</y>" + "\n" + "    <width>" + r.getWidth() + "</width>" + "\n"
				+ "    <height>" + r.getHeight() + "</height>" + "\n" + "</rectangle>";
	}

	@Override
	public String visitCompoundGraphic(CompoundShape cg) {
		return "<compound_graphic>" + "\n" + "   <id>" + cg.getId() + "</id>" + "\n" + _visitCompoundGraphic(cg)
				+ "</compound_graphic>";
	}

	private String _visitCompoundGraphic(CompoundShape cg) {
		StringBuilder sb = new StringBuilder();
		for (Shape shape : cg.children) {
			String obj = shape.accept(this);
			// Proper indentation for sub-objects.
			obj = "    " + obj.replace("\n", "\n    ") + "\n";
			sb.append(obj);
		}
		return sb.toString();
	}

}