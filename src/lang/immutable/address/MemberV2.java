package lang.immutable.address;

public class MemberV2 {
    private String name;
    private ImmutableAddress immutableAddress;

    public MemberV2(String name, ImmutableAddress immutableAddress) {
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public ImmutableAddress getImmutableAddress() {
        return immutableAddress;
    }

    public void setImmutableAddress(ImmutableAddress immutableAddress) {
        this.immutableAddress = immutableAddress;
    }

    @Override
    public String toString() {
        return "MemberV1{" +
                "name='" + name + '\'' +
                ", immutableAddress=" + immutableAddress +
                '}';
    }
}
