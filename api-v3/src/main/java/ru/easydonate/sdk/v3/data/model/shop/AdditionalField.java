package ru.easydonate.sdk.v3.data.model.shop;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import ru.easydonate.sdk.data.model.PrettyPrintable;

public interface AdditionalField extends PrettyPrintable {

    @NotNull String getName();

    @NotNull DataType getDataType();

    @NotNull String getDataTypeRaw();

    @NotNull String getDefaultValue();

    @NotNull String getDescription();

    @Getter
    @AllArgsConstructor(access = AccessLevel.PRIVATE)
    enum DataType {

        TEXT("text"),
        NUMBER("number"),
        UNKNOWN("unknown");

        private final @NotNull String key;

        public static @NotNull DataType getByKey(@Nullable String key) {
            if(key == null || key.isEmpty())
                return UNKNOWN;

            for(DataType dataType : values())
                if(dataType.getKey().equalsIgnoreCase(key))
                    return dataType;

            return UNKNOWN;
        }

    }

}
