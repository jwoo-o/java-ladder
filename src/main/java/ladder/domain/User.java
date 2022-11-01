package ladder.domain;

import java.util.Objects;

public class User {

    private static final int MAX_LENGTH = 5;
    private final String name;

    private User(String name) {
        this.name = name;
    }

    public static User from(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("사람의 이름은 5글자를 넘길 수 없습니다");
        }
        return new User(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}