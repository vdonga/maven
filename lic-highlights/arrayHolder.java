/**
 * ArithApp/basicserverPackage/arrayHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.1" from test.idl Monday, June 20, 2005
 * 11:55:04 AM PDT
 */

// GNU GENERAL PUBLIC LICENSE
// Version 3, 29 June 2007
// Copyright (C) 2007 Free Software Foundation, Inc. 
// Everyone is permitted to copy and distribute verbatim copies
// of this license document, but changing it is not allowed.

package ArithApp.basicserverPackage;

/**
 * ArithApp/basicserverPackage/arrayHelper.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.1" from test.idl Monday, June 20, 2005
 * 11:55:04 AM PDT
 */

// GNU GENERAL PUBLIC LICENSE 
// Version 3, 29 June 2007 
// Copyright (C) 2007 Free Software Foundation, Inc.  
// Everyone is permitted to copy and distribute verbatim copies 
// of this license document, but changing it is not allowed. 

abstract public class arrayHelper {
    private static String _id = "IDL:ArithApp/basicserver/array:1.0";

    // GNU GENERAL PUBLIC LICENSE  
    //If the Program specifies that a proxy can decide which future
    // versions of the GNU General Public License can be used, that proxy's
    // public statement of acceptance of a version permanently authorizes you
    // to choose that version for the Program.
    // Later license versions may give you additional or different
    // permissions. However, no additional obligations are imposed on any
    // author or copyright holder as a result of your choosing to follow a
    // later version.
    public static void insert(org.omg.CORBA.Any a, int[] that) {
        org.omg.CORBA.portable.OutputStream out = a.create_output_stream();
        a.type(type());
        write(out, that);
        a.read_value(out.create_input_stream(), type());
    }

    public static int[] extract(org.omg.CORBA.Any a) {
        return read(a.create_input_stream());
    }
    // GNU GENERAL PUBLIC LICENSE
    // Version 3, 29 June 2007
    // Copyright (C) 2007 Free Software Foundation, Inc.
    // Everyone is permitted to copy and distribute verbatim copies
    // of this license document, but changing it is not allowed.
    // Preamble
    // The GNU General Public License is a free, copyleft license for
    // software and other kinds of works.
    // The licenses for most software and other practical works are designed
    // to take away your freedom to share and change the works. By contrast,
    // the GNU General Public License is intended to guarantee your freedom to
    // share and change all versions of a program--to make sure it remains free
    // software for all its users. We, the Free Software Foundation, use the
    // GNU General Public License for most of our software; it applies also to
    // any other work released this way by its authors. You can apply it to
    // your programs, too.
    
    private static org.omg.CORBA.TypeCode __typeCode = null;

    synchronized public static org.omg.CORBA.TypeCode type() {
        if (__typeCode == null) {
            __typeCode = org.omg.CORBA.ORB.init().get_primitive_tc(org.omg.CORBA.TCKind.tk_long);
            __typeCode = org.omg.CORBA.ORB.init().create_array_tc(ArithApp.basicserver.SIZE, __typeCode);
            __typeCode = org.omg.CORBA.ORB.init().create_alias_tc(ArithApp.basicserverPackage.arrayHelper.id(), "array",
                    __typeCode);
        }
        return __typeCode;
    }

    public static String id() {
        return _id;
    }

    // If the disclaimer of warranty and limitation of liability provided
    // above cannot be given local legal effect according to their terms,
    // reviewing courts shall apply local law that most closely approximates
    // an absolute waiver of all civil liability in connection with the
    // Program, unless a warranty or assumption of liability accompanies a
    // copy of the Program in return for a fee.
    // END OF TERMS AND CONDITIONS

    public static int[] read(org.omg.CORBA.portable.InputStream istream) {
        int value[] = null;
        value = new int[ArithApp.basicserver.SIZE];
        for (int _o0 = 0; _o0 < (ArithApp.basicserver.SIZE); ++_o0) {
            value[_o0] = istream.read_long();
        }
        return value;
    }

    // The GNU General Public License is a free, copyleft license for
    // software and other kinds of works.
    // The licenses for most software and other practical works are designed
    // to take away your freedom to share and change the works. By contrast,
    // the GNU General Public License is intended to guarantee your freedom to
    // share and change all versions of a program--to make sure it remains free
    // software for all its users. We, the Free Software Foundation, use the
    // GNU General Public License for most of our software; it applies also to
    // any other work released this way by its authors. You can apply it to
    // your programs, too.

    public static void write(org.omg.CORBA.portable.OutputStream ostream, int[] value) {
        if (value.length != (ArithApp.basicserver.SIZE))
            throw new org.omg.CORBA.MARSHAL(0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
        for (int _i0 = 0; _i0 < (ArithApp.basicserver.SIZE); ++_i0) {
            ostream.write_long(value[_i0]);
        }
    }

    // This is random text from venkat

}
