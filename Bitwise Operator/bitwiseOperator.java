public class bitwiseOperator {
    public static void main(String[] args) {
        System.out.println("--- Basic Bitwise Operations ---");

        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary

        // 1. Bitwise AND (&)
        // 0101 & 0011 = 0001 (which is 1)
        System.out.println("a & b = " + (a & b));

        // 2. Bitwise OR (|)
        // 0101 | 0011 = 0111 (which is 7)
        System.out.println("a | b = " + (a | b));

        // 3. Bitwise XOR (^)
        // 0101 ^ 0011 = 0110 (which is 6)
        System.out.println("a ^ b = " + (a ^ b));

        // 4. Bitwise NOT (~)
        // ~0101 = 1010 (in 2's complement, this is -6)
        System.out.println("~a = " + (~a));

        // 5. Left Shift (<<)
        // 0101 << 1 = 1010 (which is 10). Equivalent to multiplying by 2.
        System.out.println("a << 1 = " + (a << 1));

        // 6. Right Shift (>>)
        // 0101 >> 1 = 0010 (which is 2). Equivalent to dividing by 2.
        System.out.println("a >> 1 = " + (a >> 1));

        // 7. Unsigned Right Shift (>>>)
        int negativeNum = -6; // 11111111111111111111111111111010 in binary
        // Shifting right fills with 0s, making the number positive.
        System.out.println("-6 >>> 1 = " + (negativeNum >>> 1));

        System.out.println("\n--- Real-World Problem: User Permissions ---");

        // Problem: Manage user permissions efficiently. A user can have multiple
        // permissions (Read, Write, Execute). We need to be able to grant,
        // revoke, and check these permissions.

        // Solution: Use bitwise operators. Each permission is a power of 2,
        // representing a single bit in a byte.

        final int PERMISSION_READ = 1; // 0001
        final int PERMISSION_WRITE = 2; // 0010
        final int PERMISSION_EXECUTE = 4; // 0100
        final int PERMISSION_DELETE = 8; // 1000

        // Let's say a user currently has READ and WRITE permissions.
        int userPermissions = PERMISSION_READ | PERMISSION_WRITE; // 0011

        System.out.println("Initial Permissions (Binary): " + Integer.toBinaryString(userPermissions));

        // --- Checking for a permission ---
        // To check if the user has EXECUTE permission, we use the AND operator.
        boolean hasExecutePermission = (userPermissions & PERMISSION_EXECUTE) == PERMISSION_EXECUTE;
        System.out.println("Does user have EXECUTE permission? " + hasExecutePermission);

        // --- Granting a new permission ---
        // Let's grant the user EXECUTE permission. We use the OR operator.
        userPermissions = userPermissions | PERMISSION_EXECUTE; // 0011 | 0100 = 0111
        System.out.println("Granting EXECUTE. New Permissions (Binary): " + Integer.toBinaryString(userPermissions));

        // Check again for EXECUTE permission.
        hasExecutePermission = (userPermissions & PERMISSION_EXECUTE) == PERMISSION_EXECUTE;
        System.out.println("Does user have EXECUTE permission now? " + hasExecutePermission);

        // --- Revoking a permission ---
        // Now, let's revoke the WRITE permission. We use AND with the NOT of the
        // permission.
        userPermissions = userPermissions & ~PERMISSION_WRITE; // 0111 & ~0010 => 0111 & 1101 = 0101
        System.out.println("Revoking WRITE. New Permissions (Binary): " + Integer.toBinaryString(userPermissions));

        // Check for WRITE permission.
        boolean hasWritePermission = (userPermissions & PERMISSION_WRITE) == PERMISSION_WRITE;
        System.out.println("Does user have WRITE permission now? " + hasWritePermission);

        // --- Toggling a permission ---
        // To toggle a permission (add it if not present, remove it if present), use
        // XOR.
        // Let's toggle the DELETE permission.
        userPermissions = userPermissions ^ PERMISSION_DELETE; // 0101 ^ 1000 = 1101
        System.out.println("Toggling DELETE. New Permissions (Binary): " + Integer.toBinaryString(userPermissions));

        // Toggle it again to remove it.
        userPermissions = userPermissions ^ PERMISSION_DELETE; // 1101 ^ 1000 = 0101
        System.out
                .println("Toggling DELETE again. New Permissions (Binary): " + Integer.toBinaryString(userPermissions));
    }
}
