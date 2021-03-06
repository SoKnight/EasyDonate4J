package ru.easydonate.easydonate4j.callback.data.model.gson.purchase;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import org.jetbrains.annotations.NotNull;
import ru.easydonate.easydonate4j.callback.data.model.mass.sale.MassSale;
import ru.easydonate.easydonate4j.callback.data.model.purchase.MassSaleDiscount;
import ru.easydonate.easydonate4j.json.serialization.Implementing;

import java.util.Objects;

@Getter
@Implementing(MassSaleDiscount.class)
public class MassSaleDiscountModel extends DiscountModel implements MassSaleDiscount {

    @SerializedName("target")
    private MassSale massSale;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MassSaleDiscountModel that = (MassSaleDiscountModel) o;
        return Double.compare(that.discountValue, discountValue) == 0 &&
                Objects.equals(description, that.description) &&
                Objects.equals(massSale, that.massSale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discountValue, description, massSale);
    }

    @Override
    public @NotNull String toString() {
        return "MassSaleDiscountModel{" +
                "discountValue=" + discountValue +
                ", description='" + description + '\'' +
                ", massSale=" + description +
                '}';
    }

}
