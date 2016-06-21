package example.mini.rajj.com.morderartui;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class RectAngle extends View {

    public RectAngle(Context context) {
        super(context);
    }
    public RectAngle(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public RectAngle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.WHITE);
        paint.setColor(Color.parseColor("#00000000"));
        canvas.drawRect(0,0,400,400,paint);
    }
}