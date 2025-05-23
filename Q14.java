public static String encrypt(String input) {
    return Base64.getEncoder().encodeToString(input.getBytes());
}
public static String decrypt(String encrypted) {
    return new String(Base64.getDecoder().decode(encrypted));
}