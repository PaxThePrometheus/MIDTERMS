def main():

    prog1()
    prog2()


def prog1():

    print("\nProgram 1")

    msg = "Hello Python"

    byts = msg.encode("utf-8")
    print("1. Bytes object:", byts)

    dcd = byts.decode("utf-8")
    print("2. Bytes to string:", dcd)

    hxs = byts.hex()
    print("3. Bytes to hex:", hxs)

    frhx = bytes.fromhex(hxs)
    print("4. Hex to bytes:", frhx)

    bnew = bytearray(msg, "utf-8")
    print("5. New bytearray:", bnew)

    bcnv = bytearray(byts)
    print("6. Bytes to bytearray:", bcnv)

    slcd = byts[6:]
    print("7. Sliced bytes:", slcd)

    bcnv[0] = ord("h")
    print("8. Modified message:", bcnv.decode("utf-8"))

    return 0


def readName(msg):

    while True:

        nme = input(msg).strip()

        if nme.replace(" ", "").isalpha():
            return nme

        print("Name must contain letters only, no numbers or symbols.")


def prog2():

    print("\nProgram 2")

    fnme = readName("Enter first name: ")
    lnme = readName("Enter last name: ")

    print("First name:", fnme)
    print("Last name:", lnme)

    fllnm = fnme + " " + lnme
    print("Full name:", fllnm)

    print("First character:", fllnm[0])
    print("Last character:", fllnm[-1])

    try:
        fnme[0] = "D"
    except TypeError:
        print("Strings are immutable; individual characters")
        print("cannot be changed directly.")

    nwnm = "D" + fnme[1:]
    print("New name:", nwnm)
    print("Original name:", fnme)

    print("Characters in the full name:")

    for x in fllnm:

        print(x)

    print("Sliced first name:", fllnm[0:len(fnme)])
    print("Sliced last name:", fllnm[len(fnme) + 1:])

    srch = input("Enter one character to search: ")

    while len(srch) != 1:

        print("Enter exactly one character.")
        srch = input("Enter one character to search: ")

    if srch in fllnm:

        idxs = []
        idx = fllnm.find(srch)

        while idx != -1:

            idxs.append(idx)
            idx = fllnm.find(srch, idx + 1)

        print("Character found at index:", ", ".join(str(x) for x in idxs))
        print("Occurrences:", len(idxs))

    else:
        print("Character not found")

    return 0


if __name__ == "__main__":
    main()