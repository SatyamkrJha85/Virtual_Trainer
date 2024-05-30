package com.d34th.nullpointer.virtualtrainercompose.ui.screens.exercise.componets

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.d34th.nullpointer.virtualtrainercompose.R
import com.d34th.nullpointer.virtualtrainercompose.models.Exercise
import com.d34th.nullpointer.virtualtrainercompose.ui.theme.Purple200
import com.d34th.nullpointer.virtualtrainercompose.ui.theme.orange
import com.gorisse.thomas.sceneform.colorOf

@Composable
fun ExerciseItem(
    exercise: Exercise,
    onClickExercise: () -> Unit,
    modifier: Modifier = Modifier
) {

    val gradientColors = listOf(Color(0xFFFFA500), orange) // Example: from orange to a darker orange

    Card(
        shape = RoundedCornerShape(10.dp),
        backgroundColor = Color.White,
        modifier = modifier

            .padding(8.dp)
            .clickable { onClickExercise() }
    ) {
        Row(modifier = Modifier.padding(10.dp), horizontalArrangement = Arrangement.Center) {
            AsyncImage(
                model = exercise.image,
                modifier = Modifier.weight(3f),
                contentDescription = stringResource(
                    R.string.description_exercise_item,
                    exercise.description
                )
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Column(modifier = Modifier.weight(7f)) {
                Text(
                    text = stringResource(id = exercise.title),
                    style = MaterialTheme.typography.h5,
                    fontSize = 18.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.size(10.dp))
                Text(
                    text = stringResource(id = exercise.description),
                    maxLines = 4,
                    textAlign = TextAlign.Start,
                    color = Color.Black,
                    overflow = TextOverflow.Ellipsis,
                    style = MaterialTheme.typography.caption
                )
            }
        }
    }
}