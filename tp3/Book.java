import java.util.Objects;

public record Book(String title, String author) {
	public Book {
		Objects.requireNonNull(title, "title is null");

		Objects.requireNonNull(author, "author is null");
	}

	public Book(String title) {
		this(title, "<no author>");
	}

	public Book withTitle(String title) {
		return new Book(title, author);
	}

	public boolean isFromTheSameAuthor(Book other) {
		return author.equals(other.author);
	}

	@Override
	public String println() {
		IO.println(title + "by" + author);
	}
}

