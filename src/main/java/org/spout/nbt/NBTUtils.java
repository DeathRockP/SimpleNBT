/*
 * This file is part of SpoutNBT (http://www.spout.org/).
 *
 * SpoutNBT is licensed under the SpoutDev License Version 1.
 *
 * SpoutNBT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * In addition, 180 days after any changes are published, you can use the
 * software, incorporating those changes, under the terms of the MIT license,
 * as described in the SpoutDev License Version 1.
 *
 * SpoutNBT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License,
 * the MIT license and the SpoutDev License Version 1 along with this program.
 * If not, see <http://www.gnu.org/licenses/> for the GNU Lesser General Public
 * License and see <http://www.spout.org/SpoutDevLicenseV1.txt> for the full license,
 * including the MIT license.
 */
package org.spout.nbt;

/**
 * A class which contains NBT-related utility methods.
 * @author Graham Edgecombe
 */
public final class NBTUtils {
	/**
	 * Gets the type name of a tag.
	 * @param clazz The tag class.
	 * @return The type name.
	 */
	public static String getTypeName(Class<? extends Tag> clazz) {
		if (clazz.equals(ByteArrayTag.class)) {
			return "TAG_Byte_Array";
		} else if (clazz.equals(ByteTag.class)) {
			return "TAG_Byte";
		} else if (clazz.equals(CompoundTag.class)) {
			return "TAG_Compound";
		} else if (clazz.equals(DoubleTag.class)) {
			return "TAG_Double";
		} else if (clazz.equals(EndTag.class)) {
			return "TAG_End";
		} else if (clazz.equals(FloatTag.class)) {
			return "TAG_Float";
		} else if (clazz.equals(IntTag.class)) {
			return "TAG_Int";
		} else if (clazz.equals(ListTag.class)) {
			return "TAG_List";
		} else if (clazz.equals(LongTag.class)) {
			return "TAG_Long";
		} else if (clazz.equals(ShortTag.class)) {
			return "TAG_Short";
		} else if (clazz.equals(StringTag.class)) {
			return "TAG_String";
		} else {
			throw new IllegalArgumentException("Invalid tag classs (" + clazz.getName() + ").");
		}
	}

	/**
	 * Gets the type code of a tag class.
	 * @param clazz The tag class.
	 * @return The type code.
	 * @throws IllegalArgumentException if the tag class is invalid.
	 */
	public static int getTypeCode(Class<? extends Tag> clazz) {
		if (clazz.equals(ByteArrayTag.class)) {
			return NBTConstants.TYPE_BYTE_ARRAY;
		} else if (clazz.equals(ByteTag.class)) {
			return NBTConstants.TYPE_BYTE;
		} else if (clazz.equals(CompoundTag.class)) {
			return NBTConstants.TYPE_COMPOUND;
		} else if (clazz.equals(DoubleTag.class)) {
			return NBTConstants.TYPE_DOUBLE;
		} else if (clazz.equals(EndTag.class)) {
			return NBTConstants.TYPE_END;
		} else if (clazz.equals(FloatTag.class)) {
			return NBTConstants.TYPE_FLOAT;
		} else if (clazz.equals(IntTag.class)) {
			return NBTConstants.TYPE_INT;
		} else if (clazz.equals(ListTag.class)) {
			return NBTConstants.TYPE_LIST;
		} else if (clazz.equals(LongTag.class)) {
			return NBTConstants.TYPE_LONG;
		} else if (clazz.equals(ShortTag.class)) {
			return NBTConstants.TYPE_SHORT;
		} else if (clazz.equals(StringTag.class)) {
			return NBTConstants.TYPE_STRING;
		} else {
			throw new IllegalArgumentException("Invalid tag classs (" + clazz.getName() + ").");
		}
	}

	/**
	 * Gets the class of a type of tag.
	 * @param type The type.
	 * @return The class.
	 * @throws IllegalArgumentException if the tag type is invalid.
	 */
	public static Class<? extends Tag> getTypeClass(int type) {
		switch (type) {
		case NBTConstants.TYPE_END:
			return EndTag.class;
		case NBTConstants.TYPE_BYTE:
			return ByteTag.class;
		case NBTConstants.TYPE_SHORT:
			return ShortTag.class;
		case NBTConstants.TYPE_INT:
			return IntTag.class;
		case NBTConstants.TYPE_LONG:
			return LongTag.class;
		case NBTConstants.TYPE_FLOAT:
			return FloatTag.class;
		case NBTConstants.TYPE_DOUBLE:
			return DoubleTag.class;
		case NBTConstants.TYPE_BYTE_ARRAY:
			return ByteArrayTag.class;
		case NBTConstants.TYPE_STRING:
			return StringTag.class;
		case NBTConstants.TYPE_LIST:
			return ListTag.class;
		case NBTConstants.TYPE_COMPOUND:
			return CompoundTag.class;
		default:
			throw new IllegalArgumentException("Invalid tag type : " + type + ".");
		}
	}

	/**
	 * Default private constructor.
	 */
	private NBTUtils() {

	}
}