package koschei.models;

public class Island2 {

    private Wood3 wood;

    public Island2(Wood3 wood) {
        this.wood = wood;
    }
    // тут начальная как и была через сетер без аннотаций
    @Override
    public String toString() {
        return ", на острове дерево " + wood.toString();
    }
}
