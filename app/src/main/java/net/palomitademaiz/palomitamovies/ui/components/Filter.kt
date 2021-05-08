package net.palomitademaiz.palomitamovies.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.ScrollableTabRow
import androidx.compose.material.Tab
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.palomitademaiz.palomitamovies.models.Filter

@Composable
fun Filter(
    filters: List<Filter>,
    selectedFilter: Filter,
    modifier: Modifier = Modifier
) {
    val selectedFilterIndex = filters.indexOfFirst { it == selectedFilter }
    ScrollableTabRow(
        selectedTabIndex = selectedFilterIndex,
        divider = { },
        edgePadding = 8.dp,
        indicator = { },
        modifier = modifier
    ) {
        filters.forEachIndexed { index, filter ->
            Tab(
                selected = index == selectedFilterIndex,
                onClick = { /*TODO*/ }
            ) {
                FilterChip(
                    text = filter.name,
                    selected = index == selectedFilterIndex,
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 16.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FilterPreview() {
    val selectedFilter = Filter("Selected Filter")
    val filter = Filter("Filter")
    val filterTwo = Filter("Filter2")
    val filterThree = Filter("Filter3")

    val filters = listOf(filter, selectedFilter, filterTwo, filterThree)
    Filter(
        filters = filters,
        selectedFilter = selectedFilter
    )
}